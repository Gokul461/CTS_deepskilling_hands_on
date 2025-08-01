import React, { useState } from 'react';

function Greetings() {
  const [isLogin, setIsLogin] = useState(false);
  const [greet, setGreet] = useState("Please sign up");

  const handleLogin = () => {
    setIsLogin(true);
    setGreet("Welcome");
  };

  const handleLogout = () => {
    setIsLogin(false);
    setGreet("Please sign up");
  };

  return (
    <div>
      <h1>{greet}</h1>
      {!isLogin && <button onClick={handleLogin}>Login</button>}
      {isLogin && <button onClick={handleLogout}>Logout</button>}
    </div>
  );
}

export default Greetings;
