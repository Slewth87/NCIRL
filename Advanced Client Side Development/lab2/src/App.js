import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router, Switch, Route, link} from 'react-router-dom'
import Navbar from './Components/navbar'
import Home from './views/Home'
import Shop from './views/shop'

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
    </div>
  );
}

export default App;
