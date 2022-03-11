// Implementation for Carousel element from `react-bootstrap`

import bram from '../images/Bram Stoker.jpeg';
import anne from '../images/Anne Bonny.jpeg';
import charles from '../images/Sir Charles Parsons.jpeg';
import jocelyn from '../images/Dame Jocelyn Bell Burnell.jpeg';
import ernest from '../images/Ernest Shackleton.jpeg';
import Carousel from 'react-bootstrap/Carousel';

function MyCarousel() {
    return (
            <Carousel className='banner'>
                <Carousel.Item>
                    <a href="/bram">
                        <img className="d-block w-100" id="bram" src={bram} alt="Bram Stoker" />
                        <h1 className='overlay'>Bram Stoker</h1>
                    </a>
                </Carousel.Item>
                <Carousel.Item>
                    <a href="/anne">
                        <img className="d-block w-100" id="anne" src={anne} alt="Anne Bonny" />
                        <h1 className='overlay'>Anne Bonny</h1>
                    </a>
                </Carousel.Item>
                <Carousel.Item>
                    <a href="/charles">
                        <img className="d-block w-100" id="charles" src={charles} alt="Sir Charles Parsons" />
                        <h1 className='overlay'>Sir Charles Parsons</h1>
                    </a>
                </Carousel.Item>
                <Carousel.Item>
                    <a href="/jocelyn">
                        <img className="d-block w-100" id="jocelyn" src={jocelyn} alt="Dame Jocelyn Bell Burnell" />
                        <h1 className='overlay'>Dame Jocelyn Bell Burnell</h1>
                    </a>
                </Carousel.Item>
                <Carousel.Item>
                    <a href="/ernest">
                        <img className="d-block w-100" id="ernest" src={ernest} alt="Ernest Shackleton" />
                        <h1 className='overlay'>Ernest Shackleton</h1>
                    </a>
                </Carousel.Item>
            </Carousel>
    )
}

export default MyCarousel;