// Host page for routing the site, and setting standard layout features such as the Navbar and Footer

import './App.css';
import Footer from './components/footer';
import { BrowserRouter as Router, Switch, Route, link } from 'react-router-dom';
import MyNavbar from "./components/navbar";
import Home from './views/Home';
import Bram from './views/bram';
import Anne from './views/anne';
import Charles from './views/charles';
import Jocelyn from './views/jocelyn';
import Ernest from './views/ernest';

function App() {
  return (
    <div className="App bg-secondary">
      <Router>
        <div>
          <MyNavbar/>
          <Switch>
            <Route exact path="/">
              <Home/>
            </Route>
            <Route path="/bram">
              <Bram/>
            </Route>
            <Route path="/anne">
              <Anne/>
            </Route>
            <Route path="/charles">
              <Charles/>
            </Route>
            <Route path="/jocelyn">
              <Jocelyn/>
            </Route>
            <Route path="/ernest">
              <Ernest/>
            </Route>
          </Switch>
        </div>
      <Footer/>
      </Router>
    </div>
  );
}

export default App;