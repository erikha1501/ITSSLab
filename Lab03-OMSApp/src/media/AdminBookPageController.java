package media;

import abstractdata.ADataPageController;
import abstractdata.ADataSinglePane;
import abstractdata.IDataManageController;
import api.MediaApi;
import cart.CartController;
import com.oms.bean.Book;
import com.oms.bean.Media;
import editdialog.BookEditDialog;
import editdialog.MediaEditDialog;

import java.util.List;
import java.util.Map;

public class AdminBookPageController extends AdminMediaPageController{
	public AdminBookPageController() {
		super();
	}
	@Override
	public List<? extends Media> search(Map<String, String> searchParams) {
		return new MediaApi().getBooks(searchParams);
	}
	@Override
	public MediaSinglePane createSinglePane() {
		return new BookSinglePane();
	}
	@Override
	public MediaSearchPane createSearchPane() {
		return new BookSearchPane();
	}

	@Override
	protected void edit(ADataSinglePane<Media> mediaSinglePane) {
		Book book = (Book)mediaSinglePane.getData();

		BookEditDialog dialog = new BookEditDialog(book, new IDataManageController<Media>() {
			@Override
			public void create(Media media) {

			}

			@Override
			public void read(Media media) {

			}

			@Override
			public void delete(Media media) {

			}

			@Override
			public void update(Media media) {
				mediaSinglePane.updateData(media);
				new MediaApi().updateBook((Book)media);
			}
		});
	}
}
