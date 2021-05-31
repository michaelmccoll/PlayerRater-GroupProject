import logo from '../imgs/logos/PlayerRaterLogo.png';

const RaterPlayer = ({team}) => {
    return(
        <>
            <h3>{team.first_name} {team.second_name}</h3>
            <button><img className="logo" src={logo}></img></button>
        </>
    )
}

export default RaterPlayer;