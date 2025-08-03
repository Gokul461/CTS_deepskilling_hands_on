import React, {useState} from 'react'

function CurrencyConvertor() {
    const [currency, setCurrency] = useState("");
    const [amount, setAmount] = useState(0);
    const handleConvert = () => {
        if(currency === "euro") {
            alert(`Converted amount in Euro: ${amount / 0.010}`);
        }
        else if(currency === "dollar") {
            alert(`Converted amount in Dollar: ${amount / 0.011}`);
        }
        else{
            alert("Please select a valid currency");
        }
    }
  return (
    <div style={{display: 'flex', flexDirection: 'column', alignItems: 'start', gap:"10px"}}>
      <label>Amount:
      <input type="number" value={amount} onChange={(e) => setAmount(e.target.value)} required/>
      </label>
        <label >Currency: 
        <textarea rows="1" cols="40" value={currency} required onChange={(e) => setCurrency(e.target.value)} />
        </label>
      <button onClick={handleConvert}>Convert</button>
    </div>
  )
}

export default CurrencyConvertor
