
<!DOCTYPE html>
<html>
<head>
  <title>My frist vue app</title>  
    </head>
<body>
    <div>
        <p>??????</p>
    </div>
    <div id="example">
        <my></my>
      </div>
      


<script src="https://unpkg.com/vue@2"></script>
<script>
    //注册
var Child = {
    template:'<div> A custom component!</div>'
};
var son = {
    template:'<h1> A son is coming</h1>'
}

var father ={
    // template: '
    //    
    //    
    //     </div>    
    //     '
    template: `<div class = "hd">
        <header-content></header-content>
        <header-title></header-title>
       </div>
    `,
    components:{
        'header-content':Child,
        'header-title':son
    }
}

//创建根实例
new Vue({ 
    el: '#example',
    components:{
    'my':father
    }
    
})


    </script>


</body>
</html>
