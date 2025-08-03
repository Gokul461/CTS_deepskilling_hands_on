import officeImage from "../Assets/officeImg.jpeg";
function Rentaldetails() {
  const name = "Office Space";
  const image = <img src={officeImage} alt={name} />;
  const itemName = {
    name: "DBS",
    Rent: 70000,
    Address: "Chennai",
  };
  return (
    <div>
      <h1>{name} , affordable Range</h1>
      {image}
      <h2>Details:</h2>
        <h3>Name: {itemName.name}</h3>
        <h2>
          Rent:{" "}
          <span
            style={
              itemName.Rent > 60000 ? { color: "green" } : { color: "red" }
            }
          >
            {itemName.Rent}
          </span>
        </h2>
        <h3>Address: {itemName.Address}</h3>
    </div>
  );
}

export default Rentaldetails;
