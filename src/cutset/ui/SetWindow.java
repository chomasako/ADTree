package cutset.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileFilter;

import com.sun.media.jfxmedia.events.NewFrameEvent;
import com.sun.org.apache.bcel.internal.generic.NEW;

import cutset.tree.ATNode;
import cutset.tree.ComputeSet;

//����С��2
public class SetWindow extends Frame {
	protected JFrame frame;
	protected String result;
	protected TextAreaMenu jTextArea; //�Զ�����TextAreaMenu

	public void initUI() {
		frame = new JFrame("��ȫЧ���������");    //  Javax.swing.JRrame�� ���췽��������һ�����ڶ���
		Dimension dim = getScreenSize(0.5 , 0.4);    //�Զ��巽��getScreenSize��ȡ��ǰ��Ļ�ĳߴ硪����Ⱥ͸߶�
		frame.setSize(dim.width, dim.height);      //���ô��ڶ���Ĵ�С
		frame.setLocationRelativeTo(null);  //���õ�ǰ���������ָ�������λ��
		frame.setDefaultCloseOperation(2);   //���õ�ǰ���ڵ�Ĭ�Ϲرղ���
		frame.setBackground(Color.WHITE);    //���õ�ǰ���ڵı���
		frame.setIconImage(Toolkit.getDefaultToolkit().createImage(getClass().getResource("/icons/tree.png")));  //���õ�ǰ���ڵı���ͼ��

		JScrollPane jScrollPane = new JScrollPane(); //Javax.swing.JScrollPane�� ���췽�� ������һ������������
		jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  //����ˮƽ��������ʱ��ʾ�ڴ�����
		jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);      //���ô�ֱ��������ʱ��ʾ�ڴ�����
		jScrollPane.setPreferredSize(new Dimension(600, 500));   //���ù�������õĴ�С�����߽�������仯��
		
		jTextArea = new TextAreaMenu();    //�Զ������ʵ��jTextArea ����JTextArea��ļ̳��ࣨ�����ı�������
		jTextArea.setToolTipText("");   //������ʾ��Ϣ�����ͣ��ʱ��
		jTextArea.setFont(new Font("����", Font.PLAIN, 20));  //��������
		jTextArea.setLineWrap(true);  //���õ��й���ʱ�Ƿ��Զ�����
		
		jScrollPane.setViewportView(jTextArea);   //������ ����һ���ӿ�(����б�Ҫ)����������ͼ
		frame.add(jScrollPane); //��ǰ���ڶ�����ӹ�����

		frame.setVisible(true);    //���ô���Ϊ�ɼ�
	}

	public void setPanel(String result) {   
		jTextArea.setText(result);
		
	}

	public Dimension getScreenSize(double scaleY, double scaleX) {
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice[] gs = ge.getScreenDevices();
		DisplayMode dm = gs[0].getDisplayMode();
		return new Dimension((int) (dm.getWidth() * scaleX), (int) (dm.getHeight() * scaleY));
	}

}