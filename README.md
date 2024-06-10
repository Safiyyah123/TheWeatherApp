Safiyyah Aswani
ST10441299
**My weather app**
*https://github.com/Safiyyah123/TheWeatherApp*

# Pseudocode (App Planning)
Start
  Declarations
    String min_temperatures[size] = "12", "12", "12", "12", "10", "10", "11"
    string max_temperatures[size] = "26", "25", "20", "20", "25", "26", "22"
    // Declare and initialize variables to store the sum of minimum and maximum temperatures
SUM_MIN_TEMPERATURES = 0
SUM_MAX_TEMPERATURES = 0

// Declare variables for average temperatures
AVG_MIN_TEMPERATURE = 0
AVG_MAX_TEMPERATURE = 0

// Calculate sum of minimum and maximum temperatures using a loop
FOR i = 0 TO LENGTH(MIN_TEMPERATURES) - 1
    SUM_MIN_TEMPERATURES = SUM_MIN_TEMPERATURES + MIN_TEMPERATURES[i]
    SUM_MAX_TEMPERATURES = SUM_MAX_TEMPERATURES + MAX_TEMPERATURES[i]
END FOR

// Calculate average temperatures
AVG_MIN_TEMPERATURE = SUM_MIN_TEMPERATURES / LENGTH(MIN_TEMPERATURES)
AVG_MAX_TEMPERATURE = SUM_MAX_TEMPERATURES / LENGTH(MAX_TEMPERATURES)

// Display average temperatures
PRINT "Average minimum temperature for the week: " + AVG_MIN_TEMPERATURE
PRINT "Average maximum temperature for the week: " + AVG_MAX_TEMPERATURE

// Function to display detailed information for each day
FUNCTION display_day_info(day)
    IF day < 1 OR day > LENGTH(MIN_TEMPERATURES)
        PRINT "Invalid day. Please enter a day between 1 and " + LENGTH(MIN_TEMPERATURES)
    ELSE
        PRINT "Day " + day + " information:"
        PRINT "Minimum temperature: " + MIN_TEMPERATURES[day - 1]
        PRINT "Maximum temperature: " + MAX_TEMPERATURES[day - 1]
        // Declare variable for average temperature of the day
        AVG_TEMP = (MIN_TEMPERATURES[day - 1] + MAX_TEMPERATURES[day - 1]) / 2
        PRINT "Average temperature: " + AVG_TEMP
    END IF
END FUNCTION

// Loop to allow user to view detailed information for each day
WHILE TRUE
    PRINT "Enter a day number to view detailed information (1 to " + LENGTH(MIN_TEMPERATURES) + "), or 0 to exit: "
    INPUT user_input
    IF user_input == 0
        BREAK
    ELSE
        CALL display_day_info(user_input)
    END IF
END WHILE
END

## App Purpose
The weather app is a useful tool for users as it offers the ability to plan their activities based on anticipated weather conditions. 
By delivering minimum and maximum as well as average temperatures, the app helps users plan their activities and make informed decisions based on weather conditions. 
The detailed daily information feature allows users to dive deeper into the specifics of each days weather ensuring they have all the data they need at their fingertips. 

![The Weather App main screen](https://github.com/Safiyyah123/TheWeatherApp/assets/163822823/900e4c70-1665-4655-b1eb-e3599ec6550f)


### App explanation
The weather App is a amazing app with a good user interface used to help users to know the weather for the week.
It is user-friendly access to the weather focussing on temperature data such as the minimum, maximum and average.
The app also provides an overall average for the week giving users a sense. 

#### GitHub utilization
To effectively utilize GitHub and repositories for my History app project, I created a GitHub repository named TheWeatherApp for my project. 
This repository served as a centralised location to store and manage all the code and project files. 
By initializing all the repository with a README file, I provided essential information about the project, its purpose and how to get started.
Throughout the development process, I regularly committed and pushed my code to the GitHub repository, ensuring that the latest changes were saved and accessible to the public. 
Additionally, to ensure the functionally and reliability of my app, I conducted manual testing to ensure a seamless and enjoyable educational experience for users. 
Furthermore, I leveraged GitHub Actions workflows specifically tailored for Android app development, I configured automated testing and build processes to run whenever changes were pushed to the repository. 
This helped ensure that that my app would work not just on my computer but also on different platforms and environments, enhancing its reliability and compatibility.
In summary, by utilizing GitHub and repositories, along with GitHub Actions for automated testing and building, I established an efficient and collaborative development workflow for my history app project. (GitHub, n.d.)
_________________________________________________________________________________________________________________________________________________________________________
GitHub. (n.d.). Build software better, together. [online] *Available at: https://github.com/topics/login-page [Accessed 10 Jun. 2024].*

‌


