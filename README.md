<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/alirezaAsadi2018/onemob">
    <img src="images/logo.jpg" alt="Logo" width="280" height="280">
  </a>
  <h3 align="center">onemob</h3>

  <p align="center">
    This is an android app for online education brought to you with the hope to help those who want to learn different materials through videos and take small quizzes to perfectly 
    absorb subjects presented to them.
    <br />
    <a href="https://github.com/alirezaAsadi2018/onemob"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/alirezaAsadi2018/onemob/issues">Report Bug</a>
    ·
    <a href="https://github.com/alirezaAsadi2018/onemob/issues">Request Feature</a>
  </p>
</p>

<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary><h2 style="display: inline-block">Table of Contents</h2></summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## About The Project

Login Page             |  Home Page (Videos)
:-------------------------:|:-------------------------:
[![onemob Screen Shot 1][onemob-screenshot1]](images/screenshot1.jpg)  |  [![onemob Screen Shot 2][onemob-screenshot2]](images/screenshot2.jpg)



### Built With

* [Android](https://developers.google.com/android)
* [Django](https://www.djangoproject.com/)

<!-- GETTING STARTED -->
## Getting Started

This is an example of how you may give instructions on setting up your project locally.
To get a local copy up and running follow these simple steps.

### Prerequisites

The `requirements.txt` file should list all Python libraries that your django project depends on and `gradle` files will contain all dependecies used by android app.

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/alirezaAsadi2018/onemob.git
   ```
2. Install Pip packages
   ```sh
   pip install -r requirements.txt
   ```
4. Run django commands to start your server:
   ```sh
   python manage.py migrate
   python manage.py createsuperuser
   python manage.py runserver
   ```
5. Use gradle and androidstudio to build your android app.




<!-- MARKDOWN LINKS & IMAGES -->
[onemob-screenshot1]: images/screenshot1.jpg
[onemob-screenshot2]: images/screenshot2.jpg
