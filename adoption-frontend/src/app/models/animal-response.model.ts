export class AnimalResponse {
    constructor(private _results: AnimalResponseInterface[]){}
    public get results(): AnimalResponseInterface[] {
        return this._results;
    }
    public set results(value: AnimalResponseInterface[]) {
        this._results = value;
    }


}

interface AnimalResponseInterface {

        id: number,
        name: string,
        type: string,
        age: number,
        available: boolean
    
}