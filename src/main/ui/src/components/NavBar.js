import {Link} from 'react-router-dom';
import './NavBar.css';
import team from '../imgs/icons/team.png';
import stats from '../imgs/icons/stats.png';
import rater from '../imgs/icons/rater.png';
import matches from '../imgs/icons/matches.png';
import profile from '../imgs/icons/profile.png';

const NavBar = () => {
    return(
        <ul className="navbar">
            <li>
                <Link to="/"><img className="team" src={team}></img></Link>
            </li>
    
            <li>
                <Link to="/stats"><img className="stats" src={stats}></img></Link>
            </li>
        
            <li>
                <Link to="/rater"><img className="rater" src={rater}></img></Link>
            </li>

            <li>
                <Link to="/matches"><img className="matches" src={matches}></img></Link>
            </li>

            <li> 
                <Link to="/profile"><img className="profile" src={profile}></img></Link>
            </li>
        </ul>
    )
}

export default NavBar;