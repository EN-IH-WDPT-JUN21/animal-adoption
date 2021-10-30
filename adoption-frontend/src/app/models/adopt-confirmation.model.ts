export class AdoptConfirmationResponse {
    constructor(private _results: AdoptConmfirmationInterface[]){}
    public get results(): AdoptConmfirmationInterface[] {
        return this._results;
    }
    public set results(value: AdoptConmfirmationInterface[]) {
        this._results = value;
    }
}


interface AdoptConmfirmationInterface {
    adopterDto: {
        name: string,
        pet: number
    },
    animalDto: {
        id: number,
        name: string,
        type: string,
        age: number
        available: boolean
    },
    adoptionStatus: string
}