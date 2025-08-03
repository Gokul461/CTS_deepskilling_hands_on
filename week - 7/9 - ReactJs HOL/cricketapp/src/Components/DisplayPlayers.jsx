// import React from 'react'
import Players from './Players';
import PlayersList from './PlayersList';
import ScoreBelow70 from './ScoreBelow70';
import IndianPlayers from './ListIndianPlayer';
import OddPlayers from './OddPlayers';
import EvenPlayers from './EvenPlayers';
import IndianPlayer from './IndianPlayers';
function DisplayPlayers() {
    var flag = true;
    if(flag === true){
  return (
    <div>
    <PlayersList players={Players} />
    <hr></hr>
    <ScoreBelow70 players={Players.filter(item => (item.score < 70))} />
    </div>
  )
}
else{
    return (
      <div>
          {OddPlayers(IndianPlayer)}
        <hr></hr>
          {EvenPlayers(IndianPlayer)}
        <hr></hr>

        <IndianPlayers />
      </div>
    )
}
}
export default DisplayPlayers;
