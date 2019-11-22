import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-pop-up',
  templateUrl: './pop-up.component.html',
  styleUrls: ['./pop-up.component.css']
})
export class PopUpComponent implements OnInit {
browser:string
link:any
  constructor(
    ) { }

  ngOnInit() {
    console.log("inside ngOninint");
    this.browser=this.detectbrowser();
        this.generatelink();
        document.getElementById("img").innerHTML=this.link;
    document.getElementById("open").click();
   
  }

  closeModal(){
    console.log("inside close");
    document.getElementById("close").click();
    document.getElementById("content").style.display='block';
  }
  detectbrowser():string{
    console.log("inside detect browser");
    const agent = window.navigator.userAgent.toLowerCase()
    switch (true) {
      case agent.indexOf('edge') > -1:
        return 'Edge';
      case agent.indexOf('opr') > -1 && !!(<any>window).opr:
        return 'Opera';
      case agent.indexOf('chrome') > -1 && !!(<any>window).chrome:
        return 'Chrome';
      case agent.indexOf('trident') > -1:
        return 'IE';
      case agent.indexOf('firefox') > -1:
        return 'Firefox';
      case agent.indexOf('safari') > -1:
        return 'Safari';
      default:
        return 'Blink';
    }
  }
   generatelink(){
    console.log("inside getlink");
   if(this.browser=='Chrome'){
     this.link=`<img src="https://images.techhive.com/images/article/2014/08/chrome-browser-logo-100375359-large.jpg"  width="172" height="142">`;
   }else if(this.browser=='Edge'){
    this.link=`<img src="https://betanews.com/wp-content/uploads/2019/06/big-microsoft-edge-logo.jpg"  width="200" height="170">`;
   }else if(this.browser=='IE'){
    this.link=`<img src="https://vignette.wikia.nocookie.net/logopedia/images/7/73/Internet_Explorer_4_%26_5.png/revision/latest/scale-to-width-down/200?cb=20180310144223"  width="172" height="142">`;
   }else if(this.browser=='Firefox'){
    this.link=`<img src="https://d33wubrfki0l68.cloudfront.net/06185f059f69055733688518b798a0feb4c7f160/9f07a/images/product-identity-assets/firefox.png"  width="200" height="170">`;
   }
   }
}


