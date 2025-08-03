import CalculateScore from './Component/CalculateScore';
import './App.css';

function App() {
  return (
    <div className="App">
      <CalculateScore name={"John Doe"} school={"XYZ High School"} total={85} goal={100} />
    </div>
  );
}

export default App;

