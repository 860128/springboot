
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










<!DOCTYPE html>
<html>
<head>
  <title>My frist vue app</title>  
    </head>
<body>
    <div id="example">
        <my-component></my-component>
      </div>

    <div id="try">
    <my><my>
    </div>

      <script src="https://unpkg.com/vue@2"></script>

      <script type="text/x-template" id="hello-world-template">
        <div>hello world!</div>  
      </script>

       <script type="text/x-template" id="mysut">
       <p>this is a test</p> 
       </script>

      <script>
        Vue.component('my-component', {
          template: '#hello-world-template'
        })
        new Vue({
          el: '#example'
        })

        Vue.component('my',{
            template:'#mysut'
        })
        new Vue({
            el:'#try'
        })

        </script>
</body>
</html>




<!-- 

div id="example">
    <my><my>
</div>

<script type="text/x-template" id="hello-world-template">
<div>hello world!</div>
</script>
<script>
    Vue.component('my',{
        template:'hello-world-template'
    })
    new Vue({
        el:"#example"
    })
</script> -->
分离组件定义
