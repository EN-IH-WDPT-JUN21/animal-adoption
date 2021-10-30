import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AnimalComponent } from './components/animal/animal.component';
import { AnimalListComponent } from './components/animal-list/animal-list.component';
import { HttpClientModule } from '@angular/common/http'
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    AnimalComponent,
    AnimalListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
