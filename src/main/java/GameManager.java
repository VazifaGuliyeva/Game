public class GameManager implements IGameService{

    @Override
    public void add(Game game) {
        System.out.println(game.getGameName()+"oyunu"+game.getPrice()+"fiyatiyla eklendi");
    }

    @Override
    public void update(Game game) {
        System.out.println(game.getGameName()+"oyunu"+game.getPrice()+"fiyatiyla guncellendi");

    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getGameName()+"oyunu silindi");

    }
}
