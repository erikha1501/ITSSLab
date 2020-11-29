package media;

import com.oms.bean.Book;
import com.oms.bean.Media;
import com.oms.bean.PhysicalMedia;

import javax.swing.*;

@SuppressWarnings("serial")
public class BookSinglePane extends PhysicalMediaSinglePane {
	private JLabel publisherLabel;
	private JLabel publicationDateLabel;
	private JLabel authorsLabel;
	private JLabel numberOfPagesLabel;
	private JLabel languageLabel;

	public BookSinglePane() {
		super();
	}
	
	public BookSinglePane(Media media) {
		this();
		this.t = media;

		displayData();
	}

	@Override
	public void buildControls() {
		super.buildControls();

		int row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		publisherLabel = new JLabel();
		add(publisherLabel, c);

		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		publicationDateLabel = new JLabel();
		add(publicationDateLabel, c);

		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		authorsLabel = new JLabel();
		add(authorsLabel, c);

		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		numberOfPagesLabel = new JLabel();
		add(numberOfPagesLabel, c);

		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		languageLabel = new JLabel();
		add(languageLabel, c);
	}

	@Override
	public void displayData() {
		super.displayData();

		if (t instanceof Book) {
			Book book = (Book)t;

			publisherLabel.setText("Publisher: " + book.getPublisher());
			publicationDateLabel.setText("Publication date: " + book.getPublicationDate().toString());

			String authorsString = "";
			if (book.getAuthors().size() == 1)
			{
				authorsString = book.getAuthors().get(0);
			}
			else
			{
				authorsString = String.format("[%s]", String.join(", ", book.getAuthors()));
			}
			authorsLabel.setText("Authors: " + authorsString);

			numberOfPagesLabel.setText("Number Of Pages: " + book.getNumberOfPages());
			languageLabel.setText("Language: " + book.getLanguage());
		}
	}
}
