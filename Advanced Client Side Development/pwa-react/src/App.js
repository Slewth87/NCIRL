import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router, Switch, Route, link} from 'react-router-dom'
import Navbar from './components/navbar'
import Home from './views/Home'
import Shop from './views/shop';
import Weather from './components/weather';

function App() {
  return (
    <div>
      <Router>
        <div>
          <Navbar />
          <div>
            <Switch>
              <Route exact path="/">
                <Home/>
              </Route>
              <Route exact path="/shop">
                <Shop/>
              </Route>
            </Switch>
          </div>
        </div>
      </Router>
          <Weather/>
    </div>
  );
}

export default App;