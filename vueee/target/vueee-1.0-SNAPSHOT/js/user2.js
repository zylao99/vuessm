new Vue({
    el:"#app",
    data:{
      user:{
          id:"",
          username:"",
          password:"",
          email:"",
          age:"",
          sex:""
      },
        userList:[]
    },

    methods:{
        findAll: function () {
            var _this = this;
            axios.get("/vueee/user/findAll.do").then(function (response) {
                _this.userList = response.data;
                console.log(_this.userList);
            }).catch(function (err) {
                console.log(err);
            });
        },
        update:function (user) {
            var _this = this;
            alert(user)
            axios.post("/vueee/user/update.do",_this.user).then(function (response) {
                _this.findAll();
            }).catch(function (err) {
            });
            
        },
        findById:function (userid) {
            var _this = this;
            axios.get("/vueee/user/findById.do", {
                params: {
                    id: userid
                }
            }).then(function (response) {
                _this.user = response.data;
                $('#myModal').modal("show");
            }).catch(function (err) {
            });
            
        }


    },

    created:function () {
        this.findAll();
    }


});