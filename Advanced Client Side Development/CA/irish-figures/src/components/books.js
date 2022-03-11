// Component for making and utilising an API call to the Google Books API

import { useState, useEffect } from "react";
import axios from 'axios';

function Books(props) {
    // Variables for retrieved data from the API call, setting a condition for what to actually return, and an error message.
    const [bookInfo, setBookInfo] = useState([]);
    const [used, setUsed] = useState(false);
    const [err, setErr] = useState('')

    useEffect(async function() {
        try {
            // API call to Google Books, including API Key generated from Google API, and a query received through props which signifies what person to look up
            var data = await axios('https://www.googleapis.com/books/v1/volumes', {params: {q: props.query, key: 'AIzaSyD9AyhB8F--bj5fLXUp5fMnGxDy0VXLAt0'}});
            // Storing the received data
            setBookInfo(data.data.items);
            // Marking if the API call was successful, so we know what to return later
            setUsed(true);
            console.log(data.data.items)
        } catch(e) {
            // Setting an error if the API call fails.
            setErr("No Books Available")
        }
    }, [])

    // If Statement to return different results depending on whether or not the API call was successful
    if (used) {
        return (
            <div>
                <h3>Related Reading:</h3>
                    {
                        // Mapping the JSON entries to retrieve data from Arrays
                        bookInfo.map(function(i, index) {
                            // If statement to skip a book and not generate an entry if there is data missing from it
                            if (!i.volumeInfo.imageLinks || !i.volumeInfo.infoLink || !i.volumeInfo.authors || !i.volumeInfo.publishedDate || !i.volumeInfo.description) {
                                console.log("Book excluded for missing data")
                            } else {
                                return (
                                    // Generates an entry for each book received from the API call
                                    <a className="row mb-1 rounded bg-light text-dark align-items-center book-box" href={i.volumeInfo.infoLink} key={index} target="_blank">
                                        <div className="col-xl-2">
                                            <img className="border border-5 border-light" src={i.volumeInfo.imageLinks.smallThumbnail}/>
                                        </div>
                                        <div className="col-xl-8">
                                            <div className="row">
                                                <h4>{i.volumeInfo.title} by {i.volumeInfo.authors[0]}</h4>
                                            </div>
                                            <div className="row text-muted">
                                                <p>Published: ({i.volumeInfo.publishedDate})</p>
                                            </div>
                                            <div className="row">
                                                <p>{i.volumeInfo.description}</p>
                                            </div>
                                        </div>
                                    </a>
                                )
                            }
                        })
                    }
            </div>
        )
    } else {
        // Error returned if the API call failed.
        return (
            <div><h3>{err}</h3></div>
        )
    }
}

export default Books;