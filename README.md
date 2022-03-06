# Garage-Case

### POSTMAN SERVICES CALL:

     
#### Park Service:

- TYPE: POST

- URL: http://localhost:8080/v1/vehicle/park 

- Body raw json: 
{
    "vehicleType":  "Car",
    "colour": "Green",
    "plate": "34_RT_4568"
}

- output: Allocated for 1 slot


#### Leave Service:

- TYPE: DELETE

- URL: http://localhost:8080/v1/vehicle/leave?key=1

- output: Vehicle left


#### Status Service:

- TYPE: GET

- URL: http://localhost:8080/v1/vehicle/status

+ output:

  * 34_YP_5698 Blue [1]

  * 34_GR_4578 Red [3, 4, 5, 6]

  * 34_GR_4578 Red [8, 9]







------------------------------------------------------------------------------------------------------------------------------------------
### Postman Screen Images:

> A Car Entered to garage

![Ekran görüntüsü 2022-03-04 025548](https://user-images.githubusercontent.com/73203384/156674211-f96e4ee4-c6ba-4e4d-bfc7-0fcdaca80788.png)




> A Truck Entered to garage

![Ekran görüntüsü 2022-03-04 025734](https://user-images.githubusercontent.com/73203384/156674214-d9a55bcb-d8a7-40a6-b5ed-b26abc16a98f.png)




> A Jeep Entered to garage

![Ekran görüntüsü 2022-03-04 025757](https://user-images.githubusercontent.com/73203384/156674215-93064864-f323-4af4-a166-90478b2e5563.png)



> A Car couldnt entered to garage beacause garage is full.

![Ekran görüntüsü 2022-03-04 025822](https://user-images.githubusercontent.com/73203384/156674216-4da7f303-448d-489c-a6e0-6b77831c53ae.png)


> A Jeep couldnt entered to garage beacause garage is full.

![Ekran görüntüsü 2022-03-04 025848](https://user-images.githubusercontent.com/73203384/156674217-4b26147c-dc2d-45ff-84dd-a834965c0eb3.png)


> The Garage status.

![son](https://user-images.githubusercontent.com/73203384/156675992-846ca915-5f04-4976-97cc-fb483ff76f8c.png)



> A Truck left from garage.

![Ekran görüntüsü 2022-03-04 030229](https://user-images.githubusercontent.com/73203384/156674220-d703b7d1-9606-4a6d-9cca-9580dca5497d.png)



> A Jeep try to enter and It did

![Ekran görüntüsü 2022-03-04 030321](https://user-images.githubusercontent.com/73203384/156674221-d9cd2976-1402-4eb5-a6f7-309af7dd1e07.png)


> The Garage is empty.

![empty](https://user-images.githubusercontent.com/73203384/156712322-c568c36c-5f0e-4d8a-a2b6-6dda28f74638.png)




Validation:
![Ekran görüntüsü 2022-03-04 030351](https://user-images.githubusercontent.com/73203384/156674223-581faa29-5be1-4564-9eb5-8771218ab025.png)
![Ekran görüntüsü 2022-03-04 030424](https://user-images.githubusercontent.com/73203384/156674224-85a4e755-a163-4069-aabb-706f65d0e77a.png)
![Ekran görüntüsü 2022-03-04 030447](https://user-images.githubusercontent.com/73203384/156674226-7921a894-bc49-4a7e-9f1b-35716145fd0e.png)
![Ekran görüntüsü 2022-03-04 032150](https://user-images.githubusercontent.com/73203384/156675422-55dcf7d4-77fd-4a45-b8a3-57ef471f078d.png)

