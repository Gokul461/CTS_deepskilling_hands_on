import IndianPlayers from './IndianPlayers';
function ListIndianPlayer() {
  return (
<div>
      <h1>List of Indian Players</h1>
      {IndianPlayers.map((player, index) => (
        <div key={index}>
          <li>{player}</li>
        </div>
      ))}
    </div>
  )
}

export default ListIndianPlayer;
