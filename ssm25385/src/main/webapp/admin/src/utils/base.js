const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm25385/",
            name: "ssm25385",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm25385/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "蚌埠学院"
        } 
    }
}
export default base
