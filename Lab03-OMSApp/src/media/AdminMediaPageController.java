package media;

import abstractdata.ADataListPane;
import abstractdata.ADataPageController;
import abstractdata.ADataSinglePane;
import abstractdata.IDataManageController;
import api.MediaApi;
import cart.CartController;
import com.oms.bean.Media;
import editdialog.MediaEditDialog;

public abstract class AdminMediaPageController extends ADataPageController<Media> {

	public AdminMediaPageController() {
		super();
	}
	
	@Override
	public ADataListPane<Media> createListPane() {
		return new AdminMediaListPane(this);
	}

	protected abstract void edit(ADataSinglePane<Media> mediaSinglePane);
}
