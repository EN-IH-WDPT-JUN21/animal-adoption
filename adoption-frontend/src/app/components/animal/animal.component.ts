import { Component, Input, OnInit, Output,EventEmitter } from '@angular/core';
import { Animal } from 'src/app/models/animal.module';

@Component({
  selector: 'animal',
  templateUrl: './animal.component.html',
  styleUrls: ['./animal.component.css']
})
export class AnimalComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {

  }

@Input() animal!:Animal;
@Output() adoptedAnimal: EventEmitter<number> = new EventEmitter();
@Input() index!:number;


adoptAnimal(index:number):void {
  this.adoptedAnimal.emit(index);
}

}
