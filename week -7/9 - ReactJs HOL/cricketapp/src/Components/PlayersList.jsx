function PlayersList({ players }) {
  return (
    <div>
      <h1>List of Players</h1>
      {players.map(player => (
        <div key={player.name}>
          <li>{player.name}<span>{player.score}</span></li>
        </div>
      ))}
    </div>
  )
}

export default PlayersList;
