package com.ObjectMovie;


public class MovieOperator {
    private Movie[] movies;

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    //展示系统的全部电影信息
    public void printAllMovice() {
        System.out.println("-------电影的所有信息如下：------------");
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("编号:" + m.getId());
            System.out.println("名称:" + m.getName());
            System.out.println("价格:" + m.getPrice());
            System.out.println("------------------------------------");
        }
    }

    // 根据电影的编号查询出该电影的全部信息
    public void searchMovieById(int id) {
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if (m.getId() == id) {
                System.out.println("该电影详情如下：");
                System.out.println("编号:" + m.getId());
                System.out.println("名称:" + m.getName());
                System.out.println("得分:" + m.getScroe());
                System.out.println("导演:" + m.getDirector());
                System.out.println("其他信息:" + m.getInfo());
                return;// 已经找到电影信息不用继续执行了
            }
        }
        System.out.println("没有该电影信息~~");
    }
}
