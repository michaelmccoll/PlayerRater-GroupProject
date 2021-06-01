import star from '../imgs/icons/rater.png';
import starFull from '../imgs/icons/starFull.png';
import Rating from 'react-rating'
import './RaterPlayer.css';

const RaterPlayer = ({team, handleChange}) => {

    const clickEvent = (event) => {
        handleChange(event, team.id)
    }


    return(
        <>
        <h4>{team.first_name} {team.second_name}</h4>
            <div className="starRating">
            <Rating 
                stop="10" 
                initialRating={team.rating}
                emptySymbol={<img src={star} className="star"/>}
                fullSymbol={<img src={starFull} className="star"/>}
                onClick={clickEvent}
            /> 
            </div>
        </>
    )
}

export default RaterPlayer;
