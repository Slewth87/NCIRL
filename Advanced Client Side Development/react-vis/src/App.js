import logo from './logo.svg';
import './App.css';
import PieVis from './components/PieVis';
import BarVis from './components/BarVis';
import LineVis from './components/LineVis';

function App() {
  return (
    <div>
      <PieVis/>
      <BarVis/>
      <LineVis/>
    </div>
  );
}

export default App;
