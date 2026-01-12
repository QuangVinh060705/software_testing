# Software Testing

## Giới thiệu

Dự án ghi lại quá trình học tập và thực hành các nội dung liên quan đến kiểm thử phần mềm.

Nội dung tập trung vào đánh giá giao diện người dùng và kiểm thử đơn vị trong ứng dụng Java.

Mục tiêu là rèn luyện tư duy kiểm thử, kỹ năng viết ca kiểm thử và quản lý mã nguồn trong quá trình phát triển phần mềm.

## Ngày 05.01 – Đánh giá giao diện người dùng

Thực hành đánh giá giao diện thông qua trang https://cantunsee.space/  
nhằm rèn luyện khả năng quan sát và nhận diện giao diện hợp lý, dễ sử dụng và có tính thẩm mỹ.

Trang ứng dụng cung cấp các bài tập so sánh hai phương án giao diện khác nhau, yêu cầu người học lựa chọn giao diện phù hợp hơn.

Nội dung đánh giá tập trung vào:

- Căn chỉnh bố cục giữa các thành phần
- Khoảng cách và sự cân đối trong giao diện
- Mức độ rõ ràng, dễ nhìn và dễ sử dụng
- Các bài tập có tính sát thực tế, giúp nâng cao khả năng đánh giá giao diện trong quá trình phát triển phần mềm
- Ảnh kết quả làm bài được lưu lại để làm minh chứng cho quá trình học tập

## Ngày 08.01 – Kiểm thử đơn vị với JUnit 5

Thực hiện dự án nhằm rèn luyện kỹ năng viết kiểm thử đơn vị thông qua bài toán phân tích điểm số học sinh.

Chương trình được xây dựng với lớp StudentAnalyzer, đảm nhiệm các chức năng:
- Đếm số học sinh giỏi (điểm ≥ 8.0)
- Tính điểm trung bình từ các điểm hợp lệ

Quy tắc xử lý dữ liệu:
- Điểm nhỏ hơn 0 hoặc lớn hơn 10 được xem là không hợp lệ
- Dữ liệu không hợp lệ bị loại bỏ khỏi quá trình tính toán

Xây dựng các ca kiểm thử để kiểm tra:
- Trường hợp dữ liệu hợp lệ
- Trường hợp giá trị biên (0, 8.0, 10)
- Trường hợp dữ liệu sai (điểm âm, điểm vượt giới hạn)

Dự án được quản lý bằng GitHub, sử dụng danh sách công việc để theo dõi tiến độ và nội dung thay đổi.

Chạy kiểm thử:


#### Cấu trúc thư mục

Thư mục `software_testing`

 - Thư mục `src`
  
    Tệp `StudentAnalyzer.java`
    
  - Thư mục `test`
  
    Tệp `StudentAnalyzerTest.java`
    
  - Tệp `README.md`

README.md  
Tài liệu mô tả mục tiêu, nội dung và cách sử dụng dự án  

#### Yêu cầu môi trường

- Máy tính cài đặt hệ điều hành Windows, Linux hoặc macOS
- Java Development Kit phiên bản 8 trở lên
- Maven để quản lý dự án và chạy kiểm thử
- Trình soạn thảo mã nguồn hoặc môi trường phát triển Java phù hợp

#### Kết quả đạt được

- Hiểu rõ quy trình kiểm thử đơn vị trong phát triển phần mềm
- Biết cách xây dựng ca kiểm thử cho nhiều loại dữ liệu khác nhau
- Nâng cao khả năng phát hiện lỗi logic trong chương trình
- Rèn luyện kỹ năng quản lý mã nguồn và làm việc với GitHub
