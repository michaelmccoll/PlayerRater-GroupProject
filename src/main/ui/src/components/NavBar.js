import {Link} from 'react-router-dom';
import './NavBar.css';

const NavBar = () => {
    return(
        <ul class="navbar">
            <li class="team">
                <Link to="/">Team</Link>
            </li>
    
            <li class="stats">
                <Link to="/stats">Stats</Link>
            </li>
        
            <li class="rater">
                <Link to="/rater">Rater</Link>
            </li>

            <li class="matches">
                <Link to="/matches">Matches</Link>
            </li>

            <li class="profile">
                <Link to="/profile">Profile</Link>
            </li>
        </ul>
    )
}

export default NavBar;