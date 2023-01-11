package Com.Flashnet.Common;

import java.util.List;

public interface IcommonDAO <E> {
    public int save(E e);
    public List<E> get();
    public int delete(String code);
}
