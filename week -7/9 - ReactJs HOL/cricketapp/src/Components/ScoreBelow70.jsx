function ScoreBelow70({players}) {
  return (
        <div>
        <h1>Players with Score less than 70</h1>
      {players.map(player => (
        <div key={player.name}>
          <li>{player.name}<span>{player.score}</span></li>
        </div>
      ))}
    </div>
  )
}

export default ScoreBelow70;
