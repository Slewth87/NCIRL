import { useState, useEffect } from "react";
import axios from "axios";

function Weather() {
    const [cityList, setCityList] = useState([]);
    const [query, setQuery] = useState('');
    const [used, setUsed] = useState(false);
    const [detail, setDetail] = useState([]);

    useEffect(async function() {
        navigator.geolocation.getCurrentPosition(async function(pos) {
            
            var city = await axios.get('https://geocode.xyz/'+pos.coords.latitude+','+pos.coords.longitude, {params: {json: 1}},[])
            var res = await axios.get('http://api.openweathermap.org/data/2.5/weather', {params: { mode: 'json', APPID: '7e62df7908e6b6b3c2c08498d7bc8109', q: city.data.city}});
            setCityList(res.data);
            setDetail(res.data.weather);
            setUsed(true);
        })
    },[])

    function handleSearchQuery(e) {
        e.preventDefault();
        setQuery(e.target.value);
    }

    async function searchCityList(e) {
        e.preventDefault();
        var res = await axios.get('http://api.openweathermap.org/data/2.5/weather', {params: { mode: 'json', APPID: '7e62df7908e6b6b3c2c08498d7bc8109', q: query}});
        setCityList(res.data)
        setDetail(res.data.weather)
        setUsed(true);
    }

    if (used) {
        console.log("loops")
        return (
            <div>
                <h2>The current weather in {cityList.name} is:</h2>
                <ul>
                    {
                        detail.map(function(i, index) {
                            return (
                                <li key={index}>
                                    There's {i.description}.
                                </li>
                            )
                        })
                    }
                    <li>
                        Temperature: {Math.round(cityList.main.temp-273.15)}° Celsius
                        <ul>
                            <li>
                                Feels like {Math.round(cityList.main.feels_like-273.15)}° Celsius
                            </li>
                        </ul>
                    </li>
                    <li>
                        Humidity: {cityList.main.humidity}%
                    </li>
                    <li>
                        Wind speed: {cityList.wind.speed}kph
                    </li>
                </ul>
            </div>
        )
    } else {
        return (
            <div>
                <h4 className="">{error}</h4>
                <div className="search_bar">
                    <div className="container">
                        <div className="input-group">
                            <input className="form-control" value={query} onChange={handleSearchQuery}/>
                            <button className="btn btn-success" onClick={searchCityList}>Search</button>
                        </div>
                        <p>Or, if your location access is working, just wait.</p>
                    </div>
                </div>
            </div>
        )
    }
}

export default Weather;