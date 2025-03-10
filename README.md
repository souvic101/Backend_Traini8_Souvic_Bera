# Backend_Traini8_YourName

To run the application :

Step 1: Ensure java21 is install in the system locally
Step 2: Open the file in your prefferable Id.And load the maven project
Step 3: Go to the application.properties file and change the username and password of your database platform.
also make a database traini8db in the MySql workbenche.If you are not using mysql then chnage the dependecies according to that.

Step 4: go to Traini8Application.class file and run the project.Check the api using postman.

Step 5: Use this json data to check the post api at postman.
#Input 1:
{
  "centerName": "Digital Marketing Pro",
  "centerCode": "DMKTNG765432",
  "address": {
    "detailedAddress": "88, Market Road, MG Avenue",
    "city": "Pune",
    "state": "Maharashtra",
    "pincode": "411001"
  },
  "studentCapacity": 120,
  "courseOfrd": ["SEO", "Content Marketing", "Google Ads"],
  "contactEmail": "hello@dmarketingpro.com",
  "contactPhone": "9765432109"
}

#Input 2:

{
        "id": 1,
        "centerName": "Tech Skill Hub",
        "centerCode": "ABC123XYZ789",
        "address": {
            "detailedAdd": "123 Main Street",
            "city": "Mumbai",
            "state": "Maharashtra",
            "pincode": "400001"
        },
        "capacity": 200,
        "courseOfrd": null,
        "createdOn": "2024-04-04T09:34:05Z",
        "contactEmail": "techhub@example.com",
        "contactPhone": "9876543210"
}



