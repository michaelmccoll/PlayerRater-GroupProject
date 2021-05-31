import logo from '../imgs/logos/PlayerRaterLogo.png';
import './Header.css';

const Header = () => {
    return(
        <>
            <img className="logo" src={logo}></img>
            <hr />
        </>
    )
}

export default Header;