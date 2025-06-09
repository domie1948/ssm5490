import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import yingpianleixing from '@/views/modules/yingpianleixing/list'
    import discussyingtingxinxi from '@/views/modules/discussyingtingxinxi/list'
    import yingtingxinxi from '@/views/modules/yingtingxinxi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import discussyingpianxinxi from '@/views/modules/discussyingpianxinxi/list'
    import yingpianxinxi from '@/views/modules/yingpianxinxi/list'
    import messages from '@/views/modules/messages/list'
    import guanhougan from '@/views/modules/guanhougan/list'
    import config from '@/views/modules/config/list'
    import yingpiandingdan from '@/views/modules/yingpiandingdan/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/yingpianleixing',
        name: '影片类型',
        component: yingpianleixing
      }
      ,{
	path: '/discussyingtingxinxi',
        name: '影厅信息评论',
        component: discussyingtingxinxi
      }
      ,{
	path: '/yingtingxinxi',
        name: '影厅信息',
        component: yingtingxinxi
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/discussyingpianxinxi',
        name: '影片信息评论',
        component: discussyingpianxinxi
      }
      ,{
	path: '/yingpianxinxi',
        name: '影片信息',
        component: yingpianxinxi
      }
      ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
      ,{
	path: '/guanhougan',
        name: '观后感',
        component: guanhougan
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/yingpiandingdan',
        name: '影片订单',
        component: yingpiandingdan
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
