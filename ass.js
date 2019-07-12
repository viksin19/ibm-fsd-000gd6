const savet = ()=>{
    let subs = document.getElementsByName('sub');
           let ss = [];
    subs.forEach((e)=>{
        if(e.checked){
            ss.push(e.value);

        }
    })
     localStorage.setItem( temail, JSON.stringify({
         tname: document.getElementById('tname').value,
     temail: document.getElementById('temail').value,
      subject: ss,
      class: ' ',
      slot:  ' ',
      suballoc: ' '
    }) );
  Show(); 
}
const Show = ()=>{
    let tr = [];
    Object.keys(localStorage).forEach((storeKey)=>{
         tr.push(JSON.parse(localStorage.getItem(storeKey)));
    });

    console.log(tr);
}
const showtimetable =()=>{
let id = document.getElementById('ckey').value;
    let alltrainer = [];
    Object.keys(localStorage).forEach(k=>{
        alltrainer.push(JSON.parse(localStorage.getItem(k)));
    });

    if( id == 'c1'){
          let row = ' ';
        alltrainer.forEach(t=>{
            if(t.class == id){
                row+=`<tr><th>Subject<th>
                       <td></td>
                       <td></td>
                       <td></td>
                       <td></td>
                       <td></td>
                       <td></td>
                       <td></td>
                       </tr>`
            }
        });

        document.getElementById('tt').innerHTML = row;

    }





}
const showtrainer = ()=>{


                const tav = _filter(  document.getElementById('classkey').value,
                document.getElementById('slotkey').value,
                document.getElementById('subkey').value

                );

                _builddrop(tav);
}



const _filter = (classkey, slotkey, subkey)=>{

    let trainers = [];
    let subExists;
    if( classkey !=null && slotkey!=null && subkey!=null){
        Object.keys(localStorage).forEach((e)=>{
            const _tr = JSON.parse(localStorage.getItem(e));
            console.log(_tr);
            subExists =_tr.subject.find((sub)=>{
                return sub == subkey
            })
            if(_tr.class ==' '  && _tr.slot==' ' && subExists != undefined && _tr.suballoc==' '){
                trainers.push(_tr);
            }
        });
                        
}
console.log(trainers);
return trainers;
}

const _builddrop = (tav)=>{
    let drop = '';
    tav.forEach(t=>{
        drop += `<option value=" ">--select--</option>
               <option value="${t.tname}">${t.tname}</option>`
    });
    console.log(drop);
    document.getElementById('tid').innerHTML = drop;
}

const saveallocation= ()=>{
    let allt = [];
    Object.keys(localStorage).forEach(k=>{
        allt.push(JSON.parse(localStorage.getItem(k)));
    });
   let allocid = document.getElementById('tid').value;
console.log(allocid);
   allt.forEach(e=>{
     
    if(e.tname == allocid){

           let ssalloc = e.subject;
        localStorage.setItem( temail, JSON.stringify({
            tname: document.getElementById('tname').value,
            temail: document.getElementById('temail').value,
            subject: ssalloc,
            class:document.getElementById('classkey').value,
            slot:document.getElementById('slotkey').value,
            suballoc: document.getElementById('subkey').value
        }) );
    }


   })
   let tr = [];
   Object.keys(localStorage).forEach((storeKey)=>{
        tr.push(JSON.parse(localStorage.getItem(storeKey)));
   });

   console.log(tr);
}