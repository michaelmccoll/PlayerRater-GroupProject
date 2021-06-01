import {useState, useEffect} from 'react';
import React from 'react';
import './Profile.css';

const Profile = ({teamId,playerId}) => {

    const [profile,setProfile] = useState([])
    const [loaded, setLoaded] = useState(false);

    const getProfile = () => {
        fetch(`http://localhost:8080/players/${playerId}`)
        .then(res => res.json())
        .then(data => setProfile(data))
        .then(() => setLoaded(true))
    }

    useEffect(()=>{
        getProfile();
    },[])

    return(
        <>
        <div className="profileCard">
            <div>
                <h5 className="badge">{profile.team.name}</h5>
            </div>

            <div>
                <h5 className="games">GAMES </h5>
            </div>

            <div>
                <h5 className="goals">GOALS {profile.age}</h5>
            </div>
            
            <div>
                <h5 className="assists">ASSISTS </h5>
            </div>

            <div>
                <h5 className="POTM">POTM</h5>
            </div>

            <div>
                <h5 className="pic">Picture</h5>
            </div>

            <div>
                <h5 className="firstName">{profile.first_name}</h5>
            </div>
            
            <div>
                <h5 className="secondName">{profile.second_name}</h5>
            </div>
            
            <div>
                <h5 className="rating">RATING 8.4</h5>
            </div>
            
        </div>
        </>
    )
}

export default Profile;

// {profile.stats[0].assists}