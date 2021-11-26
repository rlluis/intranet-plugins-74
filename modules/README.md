# Liferay Appbook

## Usage
This module allows you to show a default list of Apps(Web Content) 
inserted in a Collections and provide the functionality for the user to select 
their preferred Apps.
## Requirements
- Liferay 7.3
## Installation
- Download the .jar's file in releases and deploy it into Liferay.

or

- Clone this repository, add it to a Liferay workspace and deploy it into Liferay.
## Usage
- Create Web Content Structure using the json in templates-structure/appbook-structure.json
- Create Web Content Template for the Structure using templates-structure/-appbook-template.ftl
- Create your Apps(Web Content) based on the Appbook Structure
- Create a Collections of Web Content based on the Appbook Structure
- Go to Global Menu -> Control Panel -> Instance Settings -> Appbook -> Appbook and set your Structure ID
- Go to Global Menu -> Control Panel -> Instance Settings -> Appbook -> Appbook Selected and set your Structure ID and contentSetId(Collection ID)
- Drop the Widget "Appbook" and "Appbook Selected" on your preferred pages
## License
[MIT](https://choosealicense.com/licenses/mit/)