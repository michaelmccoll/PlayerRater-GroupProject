import React from 'react';
import './Profile.css';

const Profile = () => {
    return(
        <>
        <div className="profileCard">
            <h5 className="badge">Porto Pirates</h5>
            <h5 className="games">GAMES</h5>
            <h5 className="goals">GOALS</h5>
            <h5 className="assists">ASSISTS</h5>
            <h5 className="POTM">POTM</h5>
            <h5 className="firstName">Lionel</h5>
            <h5 className="secondName">MESSI</h5>
            <h5 className="rating">RATING 8.4</h5>
        </div>
        </>
    )
}

export default Profile;