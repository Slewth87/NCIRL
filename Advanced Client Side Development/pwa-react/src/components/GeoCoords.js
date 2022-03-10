import { useState, useEffect } from "react";
import axios from 'axios';

function GeoCoords() {
    const [long, setLong] = useState(0);
    const [lat, setLat] = useState(0);
    const [err, setErr] = useState('')
    const [city, setCity] = useState('')

    useEffect(async function() {
        if(!("geolocation" in navigator)) {
            setErr('Geolocation not available')
        }
        navigator.geolocation.getCurrentPosition(async function(pos) {
            setLat(pos.coords.latitude);
            setLong(pos.coords.longitude);
            
            try {
                var data = await axios('https://geocode.xyz/'+pos.coords.latitude+','+pos.coords.longitude, {params: {json: 1}})
            } catch(e) {
                setErr("Could not retrieve location, try again later.")
            }
            setCity(data.data.city)
        }, function(err) {
            setErr("User denied Geolocation access")
        })
    })
    
    if (err) {
        return (
            <div>
                <div>{err}</div>
            </div>
        )
    } else {
        return (
            <div>
                You are in {city}
            </div>
        )
    }
}

export default GeoCoords;