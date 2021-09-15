import { react, useState} from "react";
import './App.css';
import Navbar from "./components/Navbar/Navbar";
import {BrowserRouter as Router, Link, Route, Switch, withRouter } from "react-router-dom";
import Home from "./Pages/Home";
import DeleteBeer from "./Pages/DeleteBeer";
import AddBeer from "./Pages/AddBeer";
import PageNotFound from "./Pages/PageNotFound";
import Button from "./components/Button/DeleteLabelButton"
import AddLabelButton from "./components/Button/AddLabelButton";
import {makeStyles} from "@material-ui/core/styles";
import DeleteLabelButton from "./components/Button/DeleteLabelButton";

const useStyle = makeStyles((theme) => ({
    linkbutton: {
        textDecoration: 'none',
    },
    positionlabelbutton:{
        float: 'right',
        display: "none",
    }
    })
)

function App() {
    const classes = useStyle()
    const [showing] = useState(false)
  return (
      <div className="App">
        <Router>
        <Navbar />
            <div className={classes.positionlabelbutton}>
            <Link to="/addbeer" className ={classes.linkbutton}>
                <AddLabelButton/>
            </Link>
            <Link to="/deletebeer"  className ={classes.linkbutton}>
                <DeleteLabelButton/>
            </Link>
            </div>
          <Switch>
            <Route path="/" exact component={Home}/>
            <Route path="/deletebeer" exact component={DeleteBeer} />
            <Route path="/addbeer" exact component={AddBeer} />
            <Route path="*" exact component={PageNotFound} />
          </Switch>
        </Router>
      </div>
/*
    {
        <Route path="/addbeer"><AddBeer /></Route>
        <Route path="/deletebeer"><DeleteBeer /></Route>
    }
  );*/
  )
}

export default App;
