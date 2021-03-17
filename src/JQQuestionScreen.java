/*
 * Licensed to the Free Software Foundation (FSF) under one or more
 * contributor license agreements. The FSF licenses this file to You under 
 * the GNU General Public License, Version 3.0 (the "License"); you may 
 * not use this file except in compliance with the License.  You may obtain 
 * a copy of the License at
 *
 *      http://www.gnu.org/licenses/gpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */




import javax.swing.JPanel;


/**
 * 
 * This class defines some functionality common to its'
 * sub-classes, yet allows the sub-classes to override
 * this behaviour where necessary.
 * 
 * @author Ken Williams <jquestions@truerandomness.com>
 * @see JQDragAndDropQuestionScreen
 * @see JQMultiChoiceQuestionScreen
 * 
 */
abstract public class JQQuestionScreen extends JPanel {

	JPanel headerPanel;
	JPanel buttonPanel;
	
	JQQuestionScreen (JPanel headerPanel, JPanel buttonPanel) {
		super();
		this.headerPanel = headerPanel;
		this.buttonPanel = buttonPanel;
	}
	
	protected abstract void setFieldsEditable(boolean b);

	protected abstract void displayQuestionRecord(Question question, JQUserAnswer currentAnswer);
	
	protected abstract boolean isCorrect(Question question);
	
	protected abstract void clearDisplay();
}
