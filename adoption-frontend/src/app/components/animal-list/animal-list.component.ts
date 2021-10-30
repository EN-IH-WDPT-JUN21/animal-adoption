import { AnimalResponse } from './../../models/animal-response.model';
import { Component, OnInit } from '@angular/core';
import { Animal } from 'src/app/models/animal.module';
import { AnimalService } from 'src/app/services/animal.service';

@Component({
  selector: 'app-animal-list',
  templateUrl: './animal-list.component.html',
  styleUrls: ['./animal-list.component.css']
})
export class AnimalListComponent implements OnInit {
  animalId: number;
  animalName: string;
  animalType: string;
  animalAge:number;
  animalAvailable: boolean;

  animalList : Array<Animal>

  adopter: string; 


  constructor(private animalService:AnimalService) { 
    this.animalId = 0;
    this.animalName = "";
    this.animalType = "";
    this.animalAge =0;
    this.animalAvailable = true;
    this.animalList = [];
    this.adopter = "";

  }

  ngOnInit(): void {
    this.getAnimals();
  }


  adoptAnimal(adopter:string, petId:number):void {
    const animal:Animal = new Animal(this.animalId,this.animalName,this.animalType,this.animalAge,this.animalAvailable);
    
  }

  getAnimals():void {
    this.animalService.getAnimals().subscribe(result => {
      
      const animalListResponse: AnimalResponse = result;
      console.log(animalListResponse)

      console.log(result[1].name)


     for (let i=0; result.length; i++){
        let animalId:number = result[i].id;
        let animalName:string = result[i].name
        let animalType:string = result[i].type
        let animalAge:number = result[i].age
        let animalAvailable:boolean = result[i].available

        this.animalList.push(new Animal(animalId,animalName,animalType,animalAge,animalAvailable));

     }

    })
  }

}
