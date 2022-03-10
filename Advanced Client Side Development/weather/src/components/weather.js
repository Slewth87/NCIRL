import { useState } from "react";
import axios from "axios";

function Weather() {
    const [cityList, setCityList] = useState([]);
    const [query, setQuery] = useState('');
    const [used, setUsed] = useState(false);
    const [detail, setDetail] = useState([]);

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

    if (used === true) {
        console.log(cityList)
        return (
            <div>
                <input value={query} onChange={handleSearchQuery}/>
                <button onClick={searchCityList}>Search</button>
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
                <input value={query} onChange={handleSearchQuery}/>
                <button onClick={searchCityList}>Search</button>
            </div>
        )
    }
}

export default Weather;