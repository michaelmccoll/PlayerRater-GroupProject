import star from '../imgs/icons/rater.png';
import starFull from '../imgs/icons/starFull.png';
import './RaterPlayer.css';

const RaterPlayer = ({team}) => {
    return(
        <>
            <h3>{team.first_name} {team.second_name}</h3>
            <div className="ratings">
                <img className="star" src={starFull}></img>
                <img className="star" src={starFull}></img>
                <img className="star" src={star}></img>
                <img className="star" src={star}></img>
                <img className="star" src={star}></img>
                <img className="star" src={star}></img>
                <img className="star" src={star}></img>
                <img className="star" src={star}></img>
                <img className="star" src={star}></img>
                <img className="star" src={star}></img>
            </div>
        </>
    )
}

export default RaterPlayer;