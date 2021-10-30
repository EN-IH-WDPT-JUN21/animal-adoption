import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs'; // reactive programming
import { AnimalResponse } from '../models/animal-response.model';
import { AdoptConfirmationResponse } from '../models/adopt-confirmation.model';

@Injectable({
  providedIn: 'root'
})
export class AnimalService {

  readonly baseUrl:string = 'http://localhost:8200/api/animals'

  constructor(private http:HttpClient) { }

getAnimals() :Observable<any> {
  return this.http.get<any>(this.baseUrl)
}

searchAnimals(ageFrom?: number,ageTo?: number, type?:string): Observable<AnimalResponse[]> {
  console.log(`What I get on the service ${ageFrom} ${ageTo} ${type}`)
  let httpParams = new HttpParams();
  if (ageFrom) httpParams = httpParams.append('ageFrom', ageFrom);      //payload
  if (ageTo) httpParams = httpParams.append('ageTo', ageTo);      //payload
  if (type) httpParams = httpParams.append('type', type);  //payload

  const httpOptions = {
    params: httpParams
  };
  return this.http.post<AnimalResponse[]>(this.baseUrl + '/', httpOptions);
}

adoptAnimal(name?:string, pet?:number) :Observable<AdoptConfirmationResponse[]> {

  let httpParams = new HttpParams();

  if(name) httpParams = httpParams.append('name', name);
  if(pet) httpParams = httpParams.append('pet', pet);


  const httpOptions = {
    params: httpParams
  };

  return this.http.post<AdoptConfirmationResponse[]>(this.baseUrl +'/adopt',httpOptions)
}
}
