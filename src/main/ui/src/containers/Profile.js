import React from 'react';
import './Profile.css';

const Profile = ({teamId,playerId}) => {

    return(
        <>
        <div className="profileCard">
            <div>
                <h5 className="badge">Porto Pirates</h5>
            </div>

            <div>
                <h5 className="games">GAMES</h5>
            </div>

            <div>
                <h5 className="goals">GOALS</h5>
            </div>
            
            <div>
                <h5 className="assists">ASSISTS</h5>
            </div>

            <div>
                <h5 className="POTM">POTM</h5>
            </div>

            <div>
                <h5 className="pic">Picture</h5>
            </div>

            <div>
                <h5 className="firstName">Lionel</h5>
            </div>
            
            <div>
                <h5 className="secondName">MESSI</h5>
            </div>
            
            <div>
                <h5 className="rating">RATING 8.4</h5>
            </div>
            
        </div>
        </>
    )
}

export default Profile;