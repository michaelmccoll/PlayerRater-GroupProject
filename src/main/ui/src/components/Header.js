import logo from '../imgs/logos/PlayerRaterLogo.png';
import menu from '../imgs/icons/menu.png';
import './Header.css';

const Header = () => {
    return(
        <>
            <img className="logo" src={logo}></img>
            <img className="menu" src={menu}></img>
            <hr />
        </>
    )
}

export default Header;