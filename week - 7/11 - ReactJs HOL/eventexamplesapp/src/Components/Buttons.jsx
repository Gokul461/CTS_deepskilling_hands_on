import React from 'react'
import { useState } from 'react'

function Buttons() {
const [count,setCount]  = useState(0);
const increment = () => {
    setCount(count + 1);
}
const decrement = () => {
    setCount(count - 1);

}
const sayWelcome = () => {
    alert("Welcome to the React App");
}
const clickMe = () => {
    alert("Button Clicked");
}

    return (
    <div style={{display: 'flex', flexDirection: 'column', alignItems: 'start',gap:"10px"}}>
        <h1>Count: {count}</h1>
        <button onClick={increment}>Increment</button>
        <button onClick={decrement}>Decrement</button>
        <button onClick={sayWelcome}>Say Welcome</button>
        <button onClick={clickMe}>Click on me</button>
    </div>
  )
}

export default Buttons;
